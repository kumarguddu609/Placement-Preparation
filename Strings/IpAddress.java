//#1108
//
//https://leetcode.com/problems/defanging-an-ip-address/
//
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (char c : address.toCharArray()){
            str.append((c == '.')? "[.]" : c );
        }
        return str.toString();
    }
}
