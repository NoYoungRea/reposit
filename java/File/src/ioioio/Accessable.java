package ioioio;

import java.util.Set;

public interface Accessable {
	void saveSchoolSet(School school,String FileName) throws Exception;
	void restoreSchool(School school,String FileName) throws Exception;


}

