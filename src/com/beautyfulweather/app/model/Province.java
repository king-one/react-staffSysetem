package com.beautyfulweather.app.model;

//为了方便后续操作，将三张表各定义一个对应的实体类
public class Province {
	 private int id ;
	 private String provinceName;
	 private String provinceCode;
	 
	 public int getId(){
		 return id;
	 }
	 public void setId(int id){
        this.id=id;			 
		 }
	 public String getProvinceName() {
			return provinceName;
		}

		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}

		public String getProvinceCode() {
			return provinceCode;
		}

		public void setProvinceCode(String provinceCode) {
			this.provinceCode = provinceCode;
		}

	 } 

