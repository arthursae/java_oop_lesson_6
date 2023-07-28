package work2;

import work2.services.JsonReportGeneratorService;
import work2.services.XmlReportGeneratorService;

public final class DocumentReportGenerator extends ReportGenerator {

    JsonReportGeneratorService json = new JsonReportGeneratorService();
    String jsonData = json.generateJson();

    XmlReportGeneratorService xml = new XmlReportGeneratorService();
    String xmlData = xml.generateXml();

}
