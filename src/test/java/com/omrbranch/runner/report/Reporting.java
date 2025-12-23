package com.omrbranch.runner.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting {
	public static void generateJvmReport(String jsonFile) {		
	String projectName ="OMR Branch Hotel Project";
	File file=new File("target\\output.html.JVMReport");
   Configuration configuration = new Configuration(file, projectName);
   configuration.addClassifications("OS", "WIN 11");
   configuration.addClassifications("Browser Name", "Chrome");
   configuration.addClassifications("Version", "144");
   configuration.addClassifications("Sprint", "35");
   
   List<String> jsonFiles=new ArrayList<>();
   jsonFiles.add(jsonFile);
   ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);
   builder.generateReports();

   
}
}