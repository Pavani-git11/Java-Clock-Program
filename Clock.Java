public class Clock {
private int hr ;
private int min ;
private int sec ;
public void showTime() {
System.out.println("Time is :"+this.hr+":" +this.min+":" +this.sec);
}
public Clock(int hr,int min,int sec) {
if((hr>=1 && hr<=12) && (min>=0 && min<=59) && (sec >=0 && sec<=59)) {
this.hr = hr ;
this.min = min ;
this.sec = sec ;
} else {
System.out.println("Enter right time..!");
}
}
public void setHr(int hr) {
if(hr>=1 && hr <=12) {
this.hr = hr;
} else {
	System.out.println("Enter the right hr");
}
}
public int getHr() {
return this.hr;
}
public void setMin(int min) {
if(min>=0 && min<=59) {
this.min = min;
}else {
	System.out.println("Enter the right min");
}
}
public int getMin() {
return this.hr;
}
public void setSec(int sec) {
if(sec >=0 && sec<=59) {
this.sec = sec;
}else {
System.out.println("Enter the right Sec");
}
}
public int getSec() {
return this.sec;
}
}
