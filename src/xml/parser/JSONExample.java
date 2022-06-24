package xml.parser;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONExample {
    public static void main(String[] args) throws Exception {
            JSONArray jsonArray = new JSONArray();
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("name", "Kevin");
            jsonObj.put("age", 22);
            jsonArray.put(jsonObj);
            JSONObject jsonObj2 = new JSONObject();
            jsonObj2.put("name", "Brenda");
            jsonObj2.put("age", 20);
            jsonArray.put(jsonObj2);
            System.out.println(jsonArray.toString());
            //print out: [{"name":"Kevin","age":22},{"name":"Brenda","age":20}]
    }
}
/*
    
Task 2:
        Connect to your Oracle Database (Using a Thin Driver) and query the SPORTSCARS table to
        obtain the entire and complete list of Sport Cars and use the Resultset to create an XML file named cars.xml
        and an XSLT file named cars.xsl The cars.xml file will carry the data showed in above Sports Cars table (figure1).
        The cars.xsl is used to style the cars.xml file so that the XML file can be presented in web browsers
        in an HTML table showed above with the data. You need to link the cars.xsl file inside cars.xml.
        Run the XmlStylizer (the class example) class to generate an HTML file named cars.html
        from cars.xml and cars.xsl files. The HTML file should contain the above HTML table

        Task 3:
        Create a Java class to read and parse the cars.xml file using JDOM API. Print the parsed data in the console.
        Task 4:
        Explain the concepts of XML Document Object Model and XML Schema.
        LAB SUBMISSION
        1. Complete All of the above lab tasks. Demonstrate your programs to your instructor before the end of the lab periods.
        2. Export your project from Eclipse to the zip file: Lab2-<your lastName>.<firstName>.zip. Then submit the zip file to My.Seneca Blackboard
*/
