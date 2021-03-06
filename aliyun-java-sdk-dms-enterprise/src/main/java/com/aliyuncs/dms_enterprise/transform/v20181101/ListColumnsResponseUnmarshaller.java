/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListColumnsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListColumnsResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListColumnsResponseUnmarshaller {

	public static ListColumnsResponse unmarshall(ListColumnsResponse listColumnsResponse, UnmarshallerContext _ctx) {
		
		listColumnsResponse.setRequestId(_ctx.stringValue("ListColumnsResponse.RequestId"));
		listColumnsResponse.setSuccess(_ctx.booleanValue("ListColumnsResponse.Success"));
		listColumnsResponse.setErrorMessage(_ctx.stringValue("ListColumnsResponse.ErrorMessage"));
		listColumnsResponse.setErrorCode(_ctx.stringValue("ListColumnsResponse.ErrorCode"));

		List<Column> columnList = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("ListColumnsResponse.ColumnList.Length"); i++) {
			Column column = new Column();
			column.setColumnId(_ctx.stringValue("ListColumnsResponse.ColumnList["+ i +"].ColumnId"));
			column.setColumnName(_ctx.stringValue("ListColumnsResponse.ColumnList["+ i +"].ColumnName"));
			column.setColumnType(_ctx.stringValue("ListColumnsResponse.ColumnList["+ i +"].ColumnType"));
			column.setNullable(_ctx.booleanValue("ListColumnsResponse.ColumnList["+ i +"].Nullable"));
			column.setDefaultValue(_ctx.stringValue("ListColumnsResponse.ColumnList["+ i +"].DefaultValue"));
			column.setAutoIncrement(_ctx.booleanValue("ListColumnsResponse.ColumnList["+ i +"].AutoIncrement"));
			column.setDescription(_ctx.stringValue("ListColumnsResponse.ColumnList["+ i +"].Description"));
			column.setSecurityLevel(_ctx.stringValue("ListColumnsResponse.ColumnList["+ i +"].SecurityLevel"));
			column.setFunctionType(_ctx.stringValue("ListColumnsResponse.ColumnList["+ i +"].FunctionType"));
			column.setDataLength(_ctx.longValue("ListColumnsResponse.ColumnList["+ i +"].DataLength"));
			column.setSensitive(_ctx.booleanValue("ListColumnsResponse.ColumnList["+ i +"].Sensitive"));
			column.setDataPrecision(_ctx.integerValue("ListColumnsResponse.ColumnList["+ i +"].DataPrecision"));
			column.setDataScale(_ctx.integerValue("ListColumnsResponse.ColumnList["+ i +"].DataScale"));

			columnList.add(column);
		}
		listColumnsResponse.setColumnList(columnList);
	 
	 	return listColumnsResponse;
	}
}