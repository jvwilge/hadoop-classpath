package nl.jpoint.hadoop.sandbox;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;

public class SandboxMapper extends Mapper<LongWritable, Text, Text, Text> {

	@Override
	protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {


		ObjectMapper mapper = new ObjectMapper();

		//when packaging/classloading is wrong the following line will throw an exception
		//since this method does not exist in older versions of Jackson
		mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);


	}
}
