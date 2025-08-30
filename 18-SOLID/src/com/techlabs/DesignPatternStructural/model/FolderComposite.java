package com.techlabs.DesignPatternStructural.model;

//Step 3: Composite – folder
import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements IFileComposit {

	String folderName;
	List<IFileComposit> items = new ArrayList<>();

	public FolderComposite(String folderName) {
		this.folderName = folderName;
	}

	public void add(IFileComposit item) {
	     items.add(item);
	 }


	@Override
	public void show() {
		 System.out.println("Folder: " + folderName);
	     for (IFileComposit item : items) {
	         item.show();  // recursively call show
	     }
	}

}
