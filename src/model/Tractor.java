package model;

public class Tractor extends Vehicle {
	 private String additionalTechniques;
	 private boolean isOnlyLargeTires;
	 
	 public String getAdditionalTechniques() {
		 return this.additionalTechniques;
	 }
	 
	 public void setAdditionalTechniques(String additionalT) {
		 this.additionalTechniques = additionalT;
	 }
	 
	 public boolean getIsOnlyLargeTires() {
		 return isOnlyLargeTires;
	 }
	 
	 public void setIsOnlyLargeTires(boolean isOnlyL) {
		 this.isOnlyLargeTires = isOnlyL;
	 }
	 
	 public Tractor() {
		 setAdditionalTechniques("Improved engine");
		 setIsOnlyLargeTires(true);
	 }
	 
	 public Tractor(String additionalT, boolean isOnlyL) {
		 setAdditionalTechniques(additionalT);
		 setIsOnlyLargeTires(isOnlyL);
	 }
	 
	 public String toString() {
		 return "Additional Techniques: " + additionalTechniques + " Is only large tires: " + isOnlyLargeTires;
	 }
	 
	 
}
