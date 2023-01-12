class Solution {
    public String interpret(String cmd) {
        cmd = cmd.replace("()", "o");
        cmd = cmd.replace("(al)", "al");
        return cmd;
    }
}