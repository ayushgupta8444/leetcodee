class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {

        int answer = 0;
        int previous = 0;   
        int current = 1;    

        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i) > nums.get(i - 1)) {
                current++;
            } else {

                
                answer = Math.max(answer, current / 2);
                answer = Math.max(answer, Math.min(previous, current));

                previous = current;
                current = 1;
            }
        }

        
        answer = Math.max(answer, current / 2);
        answer = Math.max(answer, Math.min(previous, current));

        return answer;
    }
}