$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/sysversion/list',
        datatype: "json",
        colModel: [			
			{ label: '版本号Id', name: 'versionId', index: 'version_id', width: 50, key: true },
			{ label: '版本号', name: 'versionNo', index: 'version_no', width: 80 }, 			
			{ label: '版本标题', name: 'versionTitle', index: 'version_title', width: 80 }, 			
			{ label: '发布内容', name: 'versionContent', index: 'version_content', width: 80 }, 			
			{ label: '版本类型(Android、IOS)', name: 'versionType', index: 'version_type', width: 80 }, 			
			{ label: '是否强制更新', name: 'forceUpdate', index: 'force_update', width: 80 }, 			
			{ label: '下载地址', name: 'downloadUrl', index: 'download_url', width: 80 }, 			
			{ label: '是否有效', name: 'isValid', index: 'is_valid', width: 80 }, 			
			{ label: '创建人', name: 'createBy', index: 'create_by', width: 80 }, 			
			{ label: '修改人', name: 'updateBy', index: 'update_by', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '创建时间', name: 'updateTime', index: 'update_time', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
        q:{
            versionTitle: null
        },
		showList: true,
		title: null,
		sysVersion: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.sysVersion = {};
		},
		update: function (event) {
			var versionId = getSelectedRow();
			if(versionId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(versionId)
		},
		saveOrUpdate: function (event) {
			var url = vm.sysVersion.versionId == null ? "sys/sysversion/save" : "sys/sysversion/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.sysVersion),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var versionIds = getSelectedRows();
			if(versionIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "sys/sysversion/delete",
                    contentType: "application/json",
				    data: JSON.stringify(versionIds),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(versionId){
			$.get(baseURL + "sys/sysversion/info/"+versionId, function(r){
                vm.sysVersion = r.sysVersion;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{
                postData:{'versionTitle': vm.q.versionTitle},
                page:page
            }).trigger("reloadGrid");
		}
	}
});