package org.myorg;

import org.apache.hadoop.fs.FileSystem;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;

import com.sun.org.apache.xerces.internal.util.URI;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;

public class readFromHdfs {
 
public static void main(String[] args) throws Exception {
 
//File to read in HDFS
String uri = args[0];
 
Configuration conf = new Configuration();
 
//Get the filesystem - HDFS
FileSystem hdfs = FileSystem.get(new URI("hdfs://hadoop.com:8020"), conf);
FSDataInputStream in = null;
 
try {
//Open the path mentioned in HDFS
in = fs.open(new Path(uri));
IOUtils.copyBytes(in, System.out, 4096, false);
 
System.out.println("End Of file: HDFS file read complete");
 
} finally {
IOUtils.closeStream(in);
}
}
}

