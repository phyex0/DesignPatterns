
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BarChartRacer {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
/////////////////  XML Dosyasi buradan calisiyor ////////////////// 
        /*
        File myCountries = new File("country_populations.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        org.w3c.dom.Document doc = (org.w3c.dom.Document) db.parse(myCountries);
        doc.getDocumentElement().normalize();
        int kxml = 22;
        Node node;
        NodeList nodeList = doc.getElementsByTagName("record");
        Element eElement;
        String title = doc.getElementsByTagName("title").item(0).getTextContent();
        String xAxis = doc.getElementsByTagName("xlabel").item(0).getTextContent();
        String source = "";
        String[] data;
        String entry;
        BarChart chart = new BarChart(title, xAxis, source);
        Bar[] bars = new Bar[kxml];
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(1000, 700);
        String country, category;
        int data_val, count = 0, i = 0;

        for (int itr = 0; itr < nodeList.getLength()/kxml; itr++) {
            node = nodeList.item(itr);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                eElement = (Element) node;
                count = 0;
                for (i = 0 + itr; count < kxml; i += 60, count++) {
                    node = nodeList.item(i);
                    try{
                        eElement = (Element) node;
                        country = eElement.getElementsByTagName("field").item(1).getTextContent();
                        category = eElement.getElementsByTagName("field").item(4).getTextContent();
                        data_val = Integer.parseInt(eElement.getElementsByTagName("field").item(3).getTextContent());
                        bars[count] = new Bar(country, data_val, category);
                        chart.setCaption(eElement.getElementsByTagName("field").item(2).getTextContent());
                    }
                    catch(Exception e){System.out.println(""+e);}
                }
                Arrays.sort(bars, Comparator.reverseOrder());

                // add the bars to the bar chart
                for (int j = 0; j < kxml; j++) {
                    String name = bars[j].getName();
                    int value = bars[j].getValue();
                    String categorial = bars[j].getCategory();
                    chart.add(name, value, categorial);
                }

                // draw the bar chart
                StdDraw.clear();
                chart.draw();
                StdDraw.show();
                StdDraw.pause(50);
                chart.reset();
            }
        }
 */
////////////// TEXT dosyasi ile burasi calisiyor//////////////
        File myCities = new File("AbstractFactoryPattern/BarChartRacerAssignment/cities.txt");
        Scanner in = new Scanner(myCities);
        int k = 12;

        String title = in.nextLine();
        String xAxis = in.nextLine();
        String source = in.nextLine();
        String[] data;
        String entry;

        BarChart chart = new BarChart(title, xAxis, source);

        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(1000, 700);

        AbstractFactory factory = new BarFactory();

        while (in.hasNextLine()) {

            in.nextLine();
            int n = Integer.parseInt(in.nextLine());

            // create array of bars using data and sort them
            Bar[] bars = new Bar[n];

            for (int i = 0; i < n; i++) {

                entry = in.nextLine();
                data = entry.split(",");
                //bars[i] = new Bar(data[1], Integer.parseInt(data[3]), data[4]);
                bars[i] = factory.getBar(data[1], Integer.parseInt(data[3]), data[4]);

                chart.setCaption(data[0]);
            }
            Arrays.sort(bars, Comparator.reverseOrder());

            // add the bars to the bar chart
            for (int i = 0; i < k; i++) {
                String name = bars[i].getName();
                int value = bars[i].getValue();
                String category = bars[i].getCategory();
                chart.add(name, value, category);
            }

            // draw the bar chart
            StdDraw.clear();
            chart.draw();
            StdDraw.show();
            StdDraw.pause(10);
            chart.reset();
        }
    }
}
