package org.springframework.xd.batch.item.hadoop;

import org.springframework.batch.item.ItemWriter;
import org.springframework.data.hadoop.pojo.DatasetOperations;

import java.util.List;

/**
 */
public class DatasetItemWriter<T> implements ItemWriter<T> {

	DatasetOperations datasetOperations;

	public void setDatasetOperations(DatasetOperations datasetOperations) {
		this.datasetOperations = datasetOperations;
	}

	public void write(List<? extends T> items) throws Exception {
		System.out.println("WRITING: " + items.size());
		datasetOperations.getDatasetWriter().write(items);
	}

}
