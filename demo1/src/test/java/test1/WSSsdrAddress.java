package test1;

import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author likunheng
 * @Date 2023/6/12 16:59
 */
@Data
@NoArgsConstructor
public class WSSsdrAddress {
    private String province;

    private String city;

    private String county;

    private String address;

    public WSSsdrAddress(String province, String city, String county, String address) {
        if (StringUtils.isBlank(province) ||
                StringUtils.isBlank(city) ||
                StringUtils.isBlank(county) ||
                StringUtils.isBlank(address)) {
//            throw new BaseException("客户联系地址出错");
            System.out.println("客户地址有误");
        }
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
    }

}
