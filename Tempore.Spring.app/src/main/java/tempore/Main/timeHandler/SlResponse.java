package tempore.Main.timeHandler;


import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Getter;
import lombok.Setter;
import tempore.Main.timeHandler.model.Trip;


//@JsonIgnoreProperties(ignoreUnknown=false)
@Getter
@Setter
public class SlResponse implements Serializable{
	/*
	om det är så här json ser ut. 
Scott Alm [10:17 AM]
{
"Trip": [
{
"ServiceDays": [
{
"planningPeriodBegin": "2018-11-15",
"planningPeriodEnd": "2018-12-30",
"sDaysR": "Mo - Fr",
"sDaysI": "nicht 24. bis 26. Dez 2018",
"sDaysB": "CF9F3E7CF830"
}
],
"LegList": {
"Leg": [
{
"Origin": {
"name": "Slussen",
"type": "ST",
"id": "A=1@O=Slussen@X=18071491@Y=59319511@U=74@L=400102011@",
"extId": "400102011",
"lon": 18.071491,
"lat": 59.319511,
"prognosisType": "PROGNOSED",
"time": "10:01:00",
"date": "2018-11-16",
"track": "2",
"rtTime": "10:02:00",
"rtDate": "2018-11-16",
"hasMainMast": true,
"mainMastId": "A=1@O=Slussen (Stockholm)@X=18071860@Y=59320284@U=74@L=300109192@",
"mainMastExtId": "300109192"
},
"Destination": {
"name": "T-Centralen",
"type": "ST",
"id": "A=1@O=T-Centralen@X=18061477@Y=59331358@U=74@L=400101051@",
"extId": "400101051",
"lon": 18.061477,
"lat": 59.331358,
"prognosisType": "PROGNOSED",
"time": "10:06:00",
"date": "2018-11-16",
"track": "3",
"rtTime": "10:05:00",
"rtDate": "2018-11-16",
"hasMainMast": true,
"mainMastId": "A=1@O=Centralen (Stockholm)@X=18057657@Y=59331134@U=74@L=300101002@",
"mainMastExtId": "300101002"
},	*/
	public String Trip;																											
}
