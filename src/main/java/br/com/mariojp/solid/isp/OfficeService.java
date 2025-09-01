package br.com.mariojp.solid.isp;

public class OfficeService {
    private final SimplePrinter device;
    public OfficeService(SimplePrinter device){ this.device = device; }
    public void printReport(String content){
        device.print(content);
    }
}
