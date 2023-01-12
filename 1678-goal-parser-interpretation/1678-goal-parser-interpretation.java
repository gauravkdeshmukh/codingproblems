class Solution {
    public String interpret(String command) {
        StringBuilder op=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' ){
                if( command.charAt(i+1)==')'){
                    op.append("o");
                }

            }
            else{
                if(command.charAt(i)!=')'){
                op.append(command.charAt(i));
                }
            }
        }
        return op.toString();
    }
}