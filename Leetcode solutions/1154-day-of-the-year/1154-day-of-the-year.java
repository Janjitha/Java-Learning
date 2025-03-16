class Solution {
    public int dayOfYear(String date) {
        String s[] = date.split("-");
		int arr[] = new int[s.length];
		arr[0]=Integer.parseInt(s[0]);
		arr[1]=Integer.parseInt(s[1]);
		arr[2]=Integer.parseInt(s[2]);
		int day =0;
		if(arr[0]%4==0 && arr[0]%100!=0 || arr[0]%400==0) {
			for(int i=1;i<arr[1];i++) {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
					day=day+31;
				}
				else if(i==2) {
					day=day+29;
				}
				else {
					day=day+30;
				}
			}
		}else {
			for(int i=1;i<arr[1];i++) {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
					day=day+31;
				}
				else if(i==2) {
					day=day+28;
				}
				else {
					day=day+30;
				}
			}
		}
		if(arr[1]>1) {
            return day+arr[2];
		}else {
			return arr[2];
		}
		
	}
}

/*
class Solution {
    public int dayOfYear(String date) {
        int ans = 0;
        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8));
        int[] days = new int[] {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; ++i)
        ans += days[i];
        return ans + day;
     }
  private boolean isLeapYear(int year) {
  return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }
}
*/
