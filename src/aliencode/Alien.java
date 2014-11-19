/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliencode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shivansh
 */
public class Alien {
    
	private String codeName;
	private String bloodColor;
	private int noOfAntenna;
	private int noOfLegs;
	private String homePlanet;

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getBloodColor() {
        return bloodColor;
    }

    public void setBloodColor(String bloodColor) {
        this.bloodColor = bloodColor;
    }

    public int getNoOfAntenna() {
        return noOfAntenna;
    }

    public void setNoOfAntenna(int noOfAntenna) {
        this.noOfAntenna = noOfAntenna;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

	public List<String> convertIntoList() {
            
		List<String> data = new ArrayList<String>();
		data.add("Code Name       -->  "+ getCodeName());
		data.add("Home Planet     -->  "+ getHomePlanet());
		data.add("Blood Color     -->  "+getBloodColor());
		data.add("No of Antennas  -->  "+String.valueOf(getNoOfAntenna()));
		data.add("No of Legs      -->  "+String.valueOf(getNoOfLegs()));
		return data;
	}

}
