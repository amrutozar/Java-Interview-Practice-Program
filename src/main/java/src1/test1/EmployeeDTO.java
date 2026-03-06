package src1.test1;

public class EmployeeDTO {

	 int id;
	    Integer parentId;
	    String name;

	    public EmployeeDTO(int id, Integer parentId, String name) {
	        this.id = id;
	        this.parentId = parentId;
	        this.name = name;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Integer getParentId() {
			return parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "EmployeeDTO [id=" + id + ", parentId=" + parentId + ", name=" + name + "]";
		}
	    
	    
}
