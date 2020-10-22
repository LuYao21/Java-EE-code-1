package assemble;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexUser {
    private String uname;
    private Map<String,String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;
    private List<String> hoppyList;


    /*
    * 使用构造方法注入，需要提供带参数的构造方法
    */
    public ComplexUser(String uname,List<String> hobbyList,Map<String,String> residenceMap,Set<String> aliasSet,String[] array){
        super();
        this.uname=uname;
        this.hoppyList=hobbyList;
        this.residenceMap=residenceMap;
        this.aliasSet=aliasSet;
        this.array=array;
    }
    /*
    *使用属性setter方法注入，提供默认无参数的构造方法，并为注入的属性提供setter方法
     */
    public ComplexUser(){
        super();
    }

    public String toString() {
        return "uname="+uname+";hobbylist="+hoppyList+";residenceMap="+residenceMap+";aliasSet="+aliasSet+";array="
                +array;
    }

    public void setUname(String uname) {

        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }

    public void setHoppyList(List<String> hoppyList) {
        this.hoppyList = hoppyList;
    }

    public List<String> getHoppyList() {
        return hoppyList;
    }

    public void setResidenceMap(Map residenceMap) {
        this.residenceMap = residenceMap;
    }

    public Map getResidenceMap() {
        return residenceMap;
    }

    public void setAliasSet(Set aliasSet) {
        this.aliasSet = aliasSet;
    }

    public Set getAliasSet() {
        return aliasSet;
    }

    public void setArray(String [] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }
}
