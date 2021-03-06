package com.springdeveloper.hadoop.batch;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchApp {

	private static final Log log = LogFactory.getLog(BatchApp.class);

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:/META-INF/spring/application-context.xml");
		log.info("Batch Tweet to Avro Application Running");
		context.registerShutdownHook();

		JobLauncher jobLauncher = context.getBean(JobLauncher.class);
		Job job = context.getBean(Job.class);

		jobLauncher.run(
				job,
				new JobParametersBuilder()
						.addDate("date", new Date()).toJobParameters());
		context.close();
	}
}
