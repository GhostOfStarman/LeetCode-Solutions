class Solution {
    public static String defangIPaddr(String address) {
        
        String addDef = address.replace(".","[.]");
        
        return addDef;
        
    }
}
