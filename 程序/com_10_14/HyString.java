package com_10_14;

public class HyString extends SeqString{
public HyString(String str){
super(str);
}
public int countDigital(){
int dcount=0;
char a;
for(int i=0;i<this.length();i++){
a=charAt(i);
if((int)a>='0'&&(int)a<='9'){
dcount++;
}
}System.out.println("串中数字的个数为："+dcount);
return dcount;
}
public int countAlpha(){
int dcount=0;
char a;
for(int i=0;i<this.length();i++){
a=charAt(i);
if(a>='a'&&a<='z'||a>='A'&&a<='Z'){
dcount++;
}
}
System.out.println("串中字符的个数为："+dcount);
return dcount;
}
public int countString(SeqString str){
SeqString source=this;
int dcount=0;
for(int i=0;i<this.length();i++){
int begin=0;
while(indexOf(source,begin)!=-1){
dcount++;
}
begin=indexOf(source,begin);
}
return dcount;
}
}