
public class Information 
{
	String m_employeeName = null;
	double m_salary = 0.0;
	double m_taxPercentage = 0.0;
	double m_benefits = 0.0;
	double m_paycheck = 0.0;
	
	public double getPayCheck() 
	{
		return payCheck;
	}


	Information(String Name, double salary, double taxPercentage, double benefits)
	{
		m_employeeName = Name;
		m_salary = salary;
		m_taxPercentage = taxPercentage;
		m_benefits = benefits;
	}

	public String getM_employeeName() {
		return m_employeeName;
	}

	public void setM_employeeName(String Name) {
		this.m_employeeName = Name;
	}

	public double getM_salary() {
		return m_salary;
	}

	public void setM_salary(double salary) {
		this.m_salary = salary;
	}

	public double getM_taxPercentage() {
		return m_taxPercentage;
	}

	public void setM_taxPercentage(double taxPercentage) {
		this.m_taxPercentage = taxPercentage;
	}

	public double getM_benefits() {
		return m_benefits;
	}

	public void setM_benefits(double benefits) {
		this.m_benefits = benefits;
	}
	
	
	double payCheck = m_salary - (m_salary * getM_taxPercentage() + getM_benefits());
	
}