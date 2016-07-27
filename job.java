//在家中写个框架,明天到公司使用
public void test(){
		File file=new File("C:\\Users\\Administrator\\Desktop\\file\\file.txt");
		BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
		String line=null;
		DataSet ds=this.getDataSet();
		ds.begin
		while((line=buf.readLine())!=null){
			String bank=line.split(",")[0];
			String is_default=line.split(",")[1];
			System.out.println(bank+"  "+is_default);
			ds.setFiled("BNK_NM",bank);
			ds.setFiled("IS_DEFAULT",is_default);
			ds.update("test2.test2.test2");
		}
		ds.end
		buf.close();
		
	}
