class Solution {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0, 4, "");
        return res;
    }
    
    private void dfs(String s, int idx, int rem, String path) {
        if (rem == 0 ) {
            if (idx == s.length()) res.add(path);
            return;
        }
        for (int i = 0; i < 3; i++) {
            int j = idx + i;
            if(j >= s.length()) continue;
            if (s.charAt(idx) == '0' && i > 0) continue;
            int num = Integer.parseInt(s.substring(idx, j + 1));
            if (num > 255) continue;
            dfs(s, j + 1, rem - 1, path + (path.length() == 0 ? "" : ".") + s.substring(idx, j + 1));
        }
    }
}