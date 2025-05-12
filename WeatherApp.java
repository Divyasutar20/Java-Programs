import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import org.json.*;

public class WeatherApp extends JFrame {

    private JTextField cityField;
    private JPanel mainPanel;
    private String apiKey = "7656a7806816ef7b5ac4c0acf2fd60d6"; // Replace with your own API key

    public WeatherApp() {
        setTitle("Weather App");
        setSize(600, 400); // Increased size
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(0, 0, 0, 180));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // More padding

        JLabel title = new JLabel("Weather App");
        title.setFont(new Font("Arial", Font.BOLD, 30)); // Larger font
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        cityField = new JTextField();
        cityField.setPreferredSize(new Dimension(400, 40)); // Wider & taller
        cityField.setMaximumSize(new Dimension(400, 40));
        cityField.setFont(new Font("Arial", Font.PLAIN, 18));
        cityField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton getWeatherBtn = new JButton("Get Weather");
        getWeatherBtn.setFont(new Font("Arial", Font.BOLD, 18));
        getWeatherBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        getWeatherBtn.addActionListener(e -> fetchWeather());

        mainPanel.add(title);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(cityField);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(getWeatherBtn);

        setContentPane(new JLabel(new ImageIcon("background.jpeg"))); // Background image
        getContentPane().setLayout(new GridBagLayout());
        getContentPane().add(mainPanel);

        setVisible(true);
    }

    private void fetchWeather() {
        String city = cityField.getText().trim();
        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a city name.");
            return;
        }

        try {
            String urlStr = String.format(
                "https://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s",
                URLEncoder.encode(city, "UTF-8"), apiKey);
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder jsonStr = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) jsonStr.append(line);
            br.close();

            JSONObject json = new JSONObject(jsonStr.toString());
            showWeatherData(json);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Could not retrieve weather data. " + ex.getMessage());
        }
    }

    private void showWeatherData(JSONObject json) {
        String cityName = json.getString("name");
        String country = json.getJSONObject("sys").getString("country");
        String description = json.getJSONArray("weather").getJSONObject(0).getString("description");
        double temp = json.getJSONObject("main").getDouble("temp");
        int humidity = json.getJSONObject("main").getInt("humidity");
        double windSpeed = json.getJSONObject("wind").getDouble("speed");

        JFrame resultFrame = new JFrame();
        resultFrame.setSize(800, 600); // Increased size
        resultFrame.setLocationRelativeTo(null);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));
        resultPanel.setBackground(new Color(0, 0, 0, 180));
        resultPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // More padding
        resultPanel.add(Box.createVerticalStrut(25));  // Adjust as needed


        JLabel location = new JLabel("Weather in " + cityName + ", " + country);
        location.setFont(new Font("Arial", Font.BOLD, 32));
        location.setForeground(Color.WHITE);
        location.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon weatherIcon = new ImageIcon("sun.webp"); // Make sure the file exists in your working directory
        JLabel icon = new JLabel(weatherIcon);
        icon.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel descLabel = new JLabel("Description: " + description);
        JLabel tempLabel = new JLabel("Temperature: " + temp + "°C");
        JLabel humidityLabel = new JLabel("Humidity: " + humidity + "%");
        JLabel windLabel = new JLabel("Wind Speed: " + windSpeed + " m/s");

        for (JLabel lbl : new JLabel[]{descLabel, tempLabel, humidityLabel, windLabel}) {
            lbl.setFont(new Font("Arial", Font.PLAIN, 18));
            lbl.setForeground(Color.WHITE);
            lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        }

        JButton backBtn = new JButton("Back");
        backBtn.setFont(new Font("Arial", Font.BOLD, 20));
        backBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        backBtn.addActionListener(e -> resultFrame.dispose());

        resultPanel.add(location);
        resultPanel.add(icon);
        resultPanel.add(Box.createVerticalStrut(15));
        resultPanel.add(descLabel);
        resultPanel.add(tempLabel);
        resultPanel.add(humidityLabel);
        resultPanel.add(windLabel);
        resultPanel.add(Box.createVerticalStrut(20));
        resultPanel.add(backBtn);

        resultFrame.setContentPane(resultPanel);
        resultFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WeatherApp::new);
    }
}
