import java.util.Arrays;

class AssignCookies{
    static int findContentChildren(int[] greed, int[] cookieSize) {
        int count = 0;
        int child = 0;
        int cookie = 0;
        Arrays.sort(greed);
        Arrays.sort(cookieSize);
        while(child < greed.length && cookie < cookieSize.length){
            if(greed[child] <= cookieSize[cookie]){
                count++;
                child++;
            }
                cookie++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }
}