package coloniesrising.main.economy;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StorageTableView {
	
	public SimpleStringProperty ID;
	public SimpleStringProperty ressource;
	public SimpleStringProperty ammount;
	public SimpleStringProperty price;
	
	public StorageTableView(String ID, String ressource, String ammount, String price) {
		this.ID = new SimpleStringProperty(ID);
		this.ressource = new SimpleStringProperty(ressource);
		this.ammount = new SimpleStringProperty(ammount);
		this.price = new SimpleStringProperty(price);
	}

	public static ObservableList<StorageTableView> getList(){
		
		ObservableList<StorageTableView> storageTable = FXCollections.observableArrayList();
		
		storageTable.add(new StorageTableView("0", "Coal", String.valueOf(Storage.Coal), "1"));
		storageTable.add(new StorageTableView("1", "Salt", String.valueOf(Storage.Salt), "1"));
		storageTable.add(new StorageTableView("2", "Iron", String.valueOf(Storage.Iron), "1"));
		storageTable.add(new StorageTableView("3", "Bauxite", String.valueOf(Storage.Bauxite), "1"));
		storageTable.add(new StorageTableView("4", "Copper", String.valueOf(Storage.Copper), "1"));
		storageTable.add(new StorageTableView("5", "Nickel", String.valueOf(Storage.Nickel), "1"));
		storageTable.add(new StorageTableView("6", "Silver", String.valueOf(Storage.Silver), "2"));
		storageTable.add(new StorageTableView("7", "Uranium", String.valueOf(Storage.Uranium), "3"));
		storageTable.add(new StorageTableView("8", "Gold", String.valueOf(Storage.Gold), "3"));
		storageTable.add(new StorageTableView("9", "Titanium", String.valueOf(Storage.Titanium), "2"));
		storageTable.add(new StorageTableView("10", "Tritium", String.valueOf(Storage.Tritium), "3"));
		storageTable.add(new StorageTableView("11", "Palladium", String.valueOf(Storage.Palladium), "4"));
		storageTable.add(new StorageTableView("12", "Platinum", String.valueOf(Storage.Platinum), "4"));
		storageTable.add(new StorageTableView("13", "Helium3", String.valueOf(Storage.Helium3), "6"));
		storageTable.add(new StorageTableView("14", "Food", String.valueOf(Storage.Food), "1"));
		storageTable.add(new StorageTableView("15", "Hops", String.valueOf(Storage.Hops), "1"));
		storageTable.add(new StorageTableView("16", "Grapes", String.valueOf(Storage.Grapes), "1"));
		storageTable.add(new StorageTableView("17", "Fiber Plants", String.valueOf(Storage.FiberPlants), "1"));
		storageTable.add(new StorageTableView("18", "Raw Wood", String.valueOf(Storage.RawWood), "1"));
		storageTable.add(new StorageTableView("19", "Raw Special Wood", String.valueOf(Storage.RawSpecialWood), "2"));
		storageTable.add(new StorageTableView("20", "Oil Plants", String.valueOf(Storage.OilPlants), "1"));
		storageTable.add(new StorageTableView("21", "Rubber", String.valueOf(Storage.Rubber), "1"));
		storageTable.add(new StorageTableView("22", "Pasture", String.valueOf(Storage.Pasture), "1"));
		storageTable.add(new StorageTableView("23", "Silicon", String.valueOf(Storage.Silicon), "1"));
		storageTable.add(new StorageTableView("24", "Steel", String.valueOf(Storage.Steel), "3"));
		storageTable.add(new StorageTableView("25", "Stainless Steel", String.valueOf(Storage.StainlessSteel), "5"));
		storageTable.add(new StorageTableView("26", "Tools", String.valueOf(Storage.Tools), "7"));
		storageTable.add(new StorageTableView("27", "Convenience Foods", String.valueOf(Storage.ConvenienceFoods), "4"));
		storageTable.add(new StorageTableView("28", "Battery", String.valueOf(Storage.Battery), "7"));
		storageTable.add(new StorageTableView("29", "Circuit Board", String.valueOf(Storage.CircuitBoard), "3"));
		storageTable.add(new StorageTableView("30", "Devices", String.valueOf(Storage.Devices), "7"));
		storageTable.add(new StorageTableView("31", "Transport", String.valueOf(Storage.Transport), "10"));
		storageTable.add(new StorageTableView("32", "Air Transport", String.valueOf(Storage.AirTransport), "16"));
		storageTable.add(new StorageTableView("33", "Jewellery", String.valueOf(Storage.Jewellery), "11"));
		storageTable.add(new StorageTableView("34", "Wood", String.valueOf(Storage.Wood), "2"));
		storageTable.add(new StorageTableView("35", "Special Wood", String.valueOf(Storage.SpecialWood), "3"));
		storageTable.add(new StorageTableView("36", "Fuel Rod", String.valueOf(Storage.FuelRod), "5"));
		storageTable.add(new StorageTableView("37", "Superconductors", String.valueOf(Storage.Superconductors), "5"));
		storageTable.add(new StorageTableView("38", "Gas Storage", String.valueOf(Storage.GasStorage), "5"));
		storageTable.add(new StorageTableView("39", "Clothing", String.valueOf(Storage.Clothing), "2"));
		storageTable.add(new StorageTableView("40", "Industrial Fiber", String.valueOf(Storage.IndustrialFiber), "6"));
		storageTable.add(new StorageTableView("41", "Beer", String.valueOf(Storage.Beer), "3"));
		storageTable.add(new StorageTableView("42", "Champagner", String.valueOf(Storage.Champagner), "3"));
		storageTable.add(new StorageTableView("43", "Plant Oil", String.valueOf(Storage.PlantOil), "2"));
		storageTable.add(new StorageTableView("44", "High Energy Fuel", String.valueOf(Storage.HighEnergyFuel), "3"));
		
		return storageTable;
	}
	
	public String getID() {
		return ID.get();
	}
	
	public String getRessource() {
		return ressource.get();
	}
	
	public String getAmmount() {
		return ammount.get();
	}
	
	public String getPrice() {
		return price.get();
	}


}
