package com.until.onetomany;

import java.io.*;

public class FileDivisionMergeDemo {
    private static void division(File targetFile,long cutSize){
        if (targetFile==null) return;
        int num=targetFile.length()%cutSize==0?(int)(targetFile.length()/cutSize):(int)(targetFile.length()/cutSize+1);

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(targetFile));
            BufferedOutputStream bos = null;

            int len=-1;
            byte[]bytes=null;
            int count=0;
            for (int i=0;i<num;i++){
                bos=new BufferedOutputStream(new FileOutputStream("e:\\test\\"+(i+1)+"-temp-"+targetFile.getName()));

                if (cutSize<=1024){
                    bytes=new byte[(int)cutSize];
                    count=1;
                }else {
                    bytes=new byte[1024];
                    count=(int)cutSize/1024;
                }
                while (count>0&&(len=bis.read(bytes))!=-1){
                    bos.write(bytes,0,len);
                    bos.flush();
                    count--;
                }
                if (cutSize%1024!=0){
                    bytes=new byte[(int)cutSize%1024];
                    len =bis.read(bytes);
                    bos.write(bytes,0,len);
                    bos.flush();
                    bos.close();
                }
            }
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void merge(){

    }

    public static void main(String[] args) {
        File file = new File("e:\\第 3 周考试题.doc");
        division(file,1024*1024*20);
    }
}
