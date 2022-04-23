package Tools.ModifiedContents;

import Config.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ChangeVar2Container {

    /* 文件内容替换
       filePath 文件路径
       oldstr   要修改的字符串
       newStr   修改后的字符串*/
    private static void autoReplace(String filePath, String oldstr, String newStr) {
        File file = new File(filePath);
        Long fileLength = file.length();
        byte[] fileContext = new byte[fileLength.intValue()];
        FileInputStream in = null;
        PrintWriter out = null;
        try {
            in = new FileInputStream(filePath);
            in.read(fileContext);
            // 防止中文乱码
            String str = new String(fileContext, "UTF-8");
            str = str.replace(oldstr, newStr);
            out = new PrintWriter(filePath);
            out.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.flush();
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        File file = new File(Config.CHECK_IN_GUI_FILE);
        File files[] = file.listFiles(new FRFilenameFilter());
        for(File f : files){
            if(f.isDirectory()){
            }else{
                autoReplace(file.getPath(), "var", "Container");
            }
        }
        System.out.println("完成！");
    }
}
