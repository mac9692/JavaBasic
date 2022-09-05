package helpex;

import java.util.List;
import java.util.stream.Collectors;

public class DateStream {

    public List<DbData> filterDbData(List<DbData> dbDataList) {
        return dbDataList
                .stream()
                .filter(dbData -> dbData.saveAmount > 0)
                .filter(dbData -> dbData.useAmount > 0)
                .filter(dbData -> dbData.useCancelAmount > 0)
                .collect(Collectors.toList());
    }
}
