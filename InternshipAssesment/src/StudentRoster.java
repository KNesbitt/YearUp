
public class StudentRoster 
{
	String m_students = null;
	String m_lcName = null;
	int m_lcID = 0;
	
	StudentRoster(String Name, String LcName, int ID)
	{
		m_students = Name;
		m_lcName = LcName;
		m_lcID = ID;
	}

	public String getM_students() {
		return m_students;
	}

	public String getM_lcName() {
		return m_lcName;
	}

	public int getM_lcID() {
		return m_lcID;
	}

	private void setM_lcName(String Name) {
		this.m_lcName = Name;
	}

	private void setM_lcID(int ID) {
		this.m_lcID = ID;
	}
}

