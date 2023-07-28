package work2;

import work2.services.JsonReportGeneratorService;

public final class AccountReportGenerator extends ReportGenerator {

    JsonReportGeneratorService json = new JsonReportGeneratorService();
    String data = json.generateJson();

}
