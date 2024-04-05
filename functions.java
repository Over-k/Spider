package Spider;

import java.awt.AWTException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class functions {

    public static String getContent(String url) throws Exception {
        InputStream inputStream = new URL(url).openStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        String line, lines = "";
        while ((line = in.readLine()) != null) {
            lines += line + "\n";
        }
        in.close();
        return lines;
    }

    public static String getFolderPath() {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory() + "\\Testing");
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = j.showSaveDialog(null);

        if (r == JFileChooser.APPROVE_OPTION) {
            return j.getSelectedFile().getAbsolutePath();
        } else {
            return j.getSelectedFile().getAbsolutePath();
        }
    }

    public static String getFilePath() {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getDefaultDirectory());
        j.setAcceptAllFileFilterUsed(false);
        j.setDialogTitle("Select a text file : *.txt 3afak hh");
        FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
        j.addChoosableFileFilter(restrict);
        j.showSaveDialog(null);
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            return j.getSelectedFile().getAbsolutePath();
        } else {
            return "the user cancelled the operation";
        }
    }

    public static String ReadTextFile(String filePath) {
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader in = new BufferedReader(reader);
            String line;
            String results = "";
            while ((line = in.readLine()) != null) {
                results += line + "\n";
            }
            in.close();
            return results;
        } catch (Exception e) {
            return "Failed to find the file.";
        }
    }

    public static void SaveTextFile(String saveDir, String fileName, String content) throws IOException {
        String directory = saveDir + "\\";
        BufferedWriter writer = new BufferedWriter(new FileWriter(directory + fileName + ".txt"));
        writer.write(content);
        writer.close();
    }

    public static void createFiles(String link, String directory, String url) throws Exception {
        if (!url.endsWith("/")) {
            url = url + "/";
        }
        try {
            if (!link.startsWith("http")) {
                if (link.contains("/")) {
                    String resourceType = link.substring(0, link.lastIndexOf("/")).replace("/", "\\");
                    File dir = new File(directory + resourceType);
                    dir.mkdir();
                    if (link.contains(".")) {
                        String fileName = link.substring((link.lastIndexOf("/") + 1), link.length());
                        if (fileName.endsWith(".css") || fileName.endsWith(".js") || fileName.endsWith(".html")) {
                            BufferedWriter out = new BufferedWriter(
                                    new FileWriter(directory + resourceType + "\\" + fileName));
                            String content = getContent(url + link);
                            out.write(content);
                            out.close();
                        } else if (link.endsWith(".jpeg") || fileName.endsWith(".jpg") || fileName.endsWith(".png")
                                || fileName.endsWith(".gif")) {
                            InputStream in = new URL(url + link).openStream();
                            Files.copy(in, Paths.get(directory + resourceType + "\\" + fileName),
                                    StandardCopyOption.REPLACE_EXISTING);
                        }
                    }
                } else {
                    if (link.endsWith(".css") || link.endsWith(".js") || link.endsWith(".html")) {
                        BufferedWriter out = new BufferedWriter(new FileWriter(directory + link));
                        String content = getContent(url + link);
                        out.write(content);
                        out.close();
                    } else if (link.endsWith(".jpeg") || link.endsWith(".jpg") || link.endsWith(".png")
                            || link.endsWith(".gif")) {
                        InputStream in = new URL(url + link).openStream();
                        Files.copy(in, Paths.get(directory + link), StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void OpenInBrowser(String url) throws URISyntaxException, IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(url));
        } else {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("/usr/bin/firefox -new-window " + url);
        }
    }

    public static void extractAndDownloadImages(String url, String dir, String htmlCode) {
        Document doc = Jsoup.parse(htmlCode);
        Elements imgElements = doc.select("img[src]");

        for (Element imgElement : imgElements) {
            String imageUrl = imgElement.attr("src");
            try {
                URL img = new URL(url + "/" + imageUrl);
                ReadableByteChannel rbc = Channels.newChannel(img.openStream());

                Path imagePath = Paths.get(dir + "/images", imageUrl.substring(imageUrl.lastIndexOf("/") + 1));
                Files.createDirectories(imagePath.getParent());

                try (FileOutputStream fos = new FileOutputStream(imagePath.toString())) {
                    fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
                }
            } catch (IOException e) {
            }
        }
    }

    public static String SaveScreenshoot(String SaveScreenshootDir) {
        try {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(functions.class.getName()).log(Level.SEVERE, null, ex);
            }
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenImage = robot.createScreenCapture(screenRect);
            File screenshotFile = new File(SaveScreenshootDir + "\\screenshot.png");
            ImageIO.write(screenImage, "png", screenshotFile);
            return "Screenshot saved to: " + screenshotFile.getAbsolutePath();
        } catch (AWTException | IOException e) {
            return "Error capturing screenshot: " + e.getMessage();
        }
    }

    public static void SaveWebsite(String url, String saveDir) throws Exception {
        Document doc;
        List links = new ArrayList<String>();

        try {
            doc = Jsoup
                    .connect(url)
                    .userAgent(
                            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36")
                    .header("Accept-Language", "*")
                    .get();

            String title = doc.title();
            String directory = saveDir + "\\" + title + "\\";
            File dir = new File(directory);
            dir.mkdir();
            if (!new File(directory).isDirectory()) {
                directory = saveDir + "\\Untitle\\";
                dir = new File(directory);
                dir.mkdir();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(directory + "index.html"));
            writer.write(doc.html());
            writer.close();

            Elements linkElements = doc.select("link");
            for (Element link : linkElements) {
                String attr = link.attr("href").trim();
                if (!"".equals(attr)) {
                    links.add(attr);
                }
            }
            Elements scriptElements = doc.select("script");
            for (Element link : scriptElements) {
                String attr = link.attr("src").trim();
                if (!"".equals(attr)) {
                    links.add(attr);
                }
            }
            Elements imagesElements = doc.select("img");
            for (Element link : imagesElements) {
                String attr = link.attr("src").trim();
                if (!"".equals(attr)) {
                    links.add(attr);
                }
            }
            for (Object link : links) {
                createFiles(link.toString(), directory, url);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static boolean CheckProxy(String proxyString) throws IOException {
        try {
            String[] parts = proxyString.split(":");
            String ipAddress = parts[0].trim();
            int port = Integer.parseInt(parts[1].trim());
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ipAddress, port));
            HttpURLConnection connection = (HttpURLConnection) new URL("https://www.google.com").openConnection(proxy);
            connection.connect();
            connection.getInputStream();
            if (connection.getResponseCode() == 200) {
                return true;
            }
        } catch (MalformedURLException ex) {
            return false;
        }
        return false;
    }

    public static void SendRequests(String url, String[] userAgentsList, String[] proxysList) throws IOException {
        try {
            String userAgent = (userAgentsList != null && userAgentsList.length > 0)
                    ? userAgentsList[new Random().nextInt(userAgentsList.length)]
                    : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36";

            if (proxysList != null) {
                String randomProxy = proxysList[new Random().nextInt(proxysList.length)];
                String[] parts = randomProxy.split(":");
                String ipAddress = parts[0].trim();
                int port = Integer.parseInt(parts[1].trim());
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ipAddress, port));
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection(proxy);
                connection.setRequestProperty("User-Agent", userAgent);
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Referer", "www.google.com");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.getInputStream();
            }
            if (userAgentsList != null && proxysList == null) {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestProperty("User-Agent", userAgent);
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Referer", "www.google.com");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.getInputStream();
            } else {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Referer", "www.google.com");
                connection.setConnectTimeout(10000);
                connection.setReadTimeout(10000);
                connection.getInputStream();
            }
        } catch (IOException ex) {
        }
    }
}
