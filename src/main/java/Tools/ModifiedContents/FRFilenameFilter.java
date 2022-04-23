package Tools.ModifiedContents;

import java.io.File;
import java.io.FilenameFilter;

public class FRFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        boolean flag = false;
        if (name.toLowerCase().endsWith(".java")) {
            flag = true;
        }
        return flag;
    }
}
