class Solution {
    public int leastInterval(char[] tasks, int n) {
            int maxFreq=0;
            int maxcount=0;
        int empty=0;
            HashMap <Character,Integer> map= new HashMap<>();
            for(int i=0;i<tasks.length;i++)
            {
                if(map.containsKey(tasks[i]))
                {
                    
                  int cnt=map.get(tasks[i])+1;
                    map.put(tasks[i],cnt);
                    maxFreq=Math.max(maxFreq,cnt);
                }
                else
                {
                    map.put(tasks[i],1);
                }
            }
        for(int val: map.values())
        {  if(val==maxFreq)
                maxcount=maxcount+1;
        }
            
        int partition=maxFreq-1;
        empty=(n-(maxcount-1))*partition;
        int available=tasks.length-(maxcount*maxFreq);
        int idle=Math.max(0,empty-available);
        return (tasks.length+idle);
        
    }
}