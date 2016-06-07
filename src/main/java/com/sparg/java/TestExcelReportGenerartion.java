package com.sparg.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.sparg.java.file.utils.ExportToExcel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * @author: vimal.sengoden
 * Date: 12/9/2014
 * Time: 11:47 AM
 */
public class TestExcelReportGenerartion {

    private static final String EXCEL_TEMPLATE = "excel_template.xlsx";
    private static final String EXCEL_REPORT = "excel_report.xlsx";

    public static class Report {
        private String certificateNumber;
        private String masterPolicyNumber;

        public Report() {
        }

        public Report(final String certificateNumber, final String masterPolicyNumber) {
            this.certificateNumber = certificateNumber;
            this.masterPolicyNumber = masterPolicyNumber;
        }

        public String getCertificateNumber() {
            return certificateNumber;
        }

        public void setCertificateNumber(final String certificateNumber) {
            this.certificateNumber = certificateNumber;
        }

        public String getMasterPolicyNumber() {
            return masterPolicyNumber;
        }

        public void setMasterPolicyNumber(final String masterPolicyNumber) {
            this.masterPolicyNumber = masterPolicyNumber;
        }
    }

    public static void main(String[] args) throws IOException, InvalidFormatException {
        Map<String, Object> beans = new HashMap<String, Object>();
        beans.put("reports1", Arrays.asList(new Report("0000000001", "12345-0001"), new Report("0000000002", "12345-0002")));
        beans.put("reports2", Arrays.asList(new Report("0000000010", "12345-0010"), new Report("0000000011", "12345-0011")));

        ExportToExcel.writeToExcel(EXCEL_REPORT, Thread.currentThread().getContextClassLoader().getResource(EXCEL_TEMPLATE).getPath(), beans);
    }


}
