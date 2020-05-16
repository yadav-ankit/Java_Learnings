package exception;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class UpdateEquipmentDetails implements Serializable {

	private static final long	serialVersionUID	= 1533757277866412871L;
	private String				orderActionID;
	private String				deliveryStatus;
	private String				imei1;
	private String				imei2;
	private String				iccid;
	private String				updateDate;
	private String				cnNumber;
	private String				shippingNotes;
	private String				sapSoNo;
	private Map<String, String>	api_IMEI_map;
	private List<String>		imeiAccessoryList;

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getCnNumber() {
		return cnNumber;
	}

	public void setCnNumber(String cnNumber) {
		this.cnNumber = cnNumber;
	}

	public String getShippingNotes() {
		return shippingNotes;
	}

	public void setShippingNotes(String shippingNotes) {
		this.shippingNotes = shippingNotes;
	}

	public String getOrderActionID() {
		return this.orderActionID;
	}

	public void setOrderActionID(String orderActionID) {
		this.orderActionID = orderActionID;
	}

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getIccid() {
		return this.iccid;
	}

	public String getImei1() {
		return this.imei1;
	}

	public void setImei1(String imei1) {
		this.imei1 = imei1;
	}

	public String getImei2() {
		return this.imei2;
	}

	public void setImei2(String imei2) {
		this.imei2 = imei2;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getSapSoNo() {
		return sapSoNo;
	}

	public void setSapSoNo(String sapSoNo) {
		this.sapSoNo = sapSoNo;
	}

	public Map<String, String> getApi_IMEI_map() {
		return api_IMEI_map;
	}

	public void setApi_IMEI_map(Map<String, String> api_IMEI_map) {
		this.api_IMEI_map = api_IMEI_map;
	}

	public List<String> getImeiAccessoryList() {
		return imeiAccessoryList;
	}

	public void setImeiAccessoryList(List<String> imeiAccessoryList) {
		this.imeiAccessoryList = imeiAccessoryList;
	}
}
