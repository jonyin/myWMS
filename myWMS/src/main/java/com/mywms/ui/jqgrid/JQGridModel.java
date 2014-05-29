package com.mywms.ui.jqgrid;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.thymeleaf.util.StringUtils;

public abstract class JQGridModel {
	private static Map<String, ColModel[]> COLMODEL_ARRAY_CACHE = new HashMap<String, ColModel[]>();
	private static Map<String, String[]> COLNAME_ARRAY_CACHE = new HashMap<String, String[]>();

	public ColModel[] getAllColModels() {
		if (COLMODEL_ARRAY_CACHE.get(this.getClass().getSimpleName()) == null) {
			Field[] fields = this.getClass().getDeclaredFields();
			List<ColModel> colModels = new ArrayList<ColModel>();
			for (Field field : fields) {
				JQGridColumn jqGridColumn = field
						.getAnnotation(JQGridColumn.class);
				if (jqGridColumn != null) {
					ColModel colModel = new ColModel();
					String name = StringUtils.isEmpty(jqGridColumn.name()) ? field
							.getName() : jqGridColumn.name();
					colModel.setName(name);
					colModel.setIndex(jqGridColumn.index());
					colModel.setWidth(jqGridColumn.width());
					colModel.setAlign(jqGridColumn.align());
					colModel.setOrder(jqGridColumn.order());
					colModels.add(colModel);
				}
			}
			Comparator<ColModel> c = new Comparator<ColModel>() {

				@Override
				public int compare(ColModel o1, ColModel o2) {
					return o1.getOrder().compareTo(o2.getOrder());
				}
			};

			Collections.sort(colModels, c);
			ColModel[] colModelArray = {};
			COLMODEL_ARRAY_CACHE.put(this.getClass().getSimpleName(),
					colModels.toArray(colModelArray));
		}
		return COLMODEL_ARRAY_CACHE.get(this.getClass().getSimpleName());

	}

	public String[] getAllColNames() {
		if (COLNAME_ARRAY_CACHE.get(this.getClass().getSimpleName()) == null) {
			List<String> colNames = new ArrayList<String>();
			for (ColModel colModel : getAllColModels()) {
				colNames.add(colModel.getName());
			}
			String[] colNameArray = {};
			COLNAME_ARRAY_CACHE.put(this.getClass().getSimpleName(),
					colNames.toArray(colNameArray));
		}
		return COLNAME_ARRAY_CACHE.get(this.getClass().getSimpleName());

	}
}
