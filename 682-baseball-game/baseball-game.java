class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")&& s.size()>1){
                int a=s.peek();
                int b=s.get(s.size()-2);
                int c=a+b;
                s.push(c);
            }
            else if(operations[i].equals("D")&& s.size()>0){
                int a=s.peek();
                s.push(2*a);
            }
            else if(operations[i].equals("C")&& s.size()>0){
                s.pop();
            }
            else{
                
                s.push(Integer.parseInt(operations[i]));
        }
       
       
    } while(!s.isEmpty()){
            sum+=s.pop();
        } return sum;
}
}