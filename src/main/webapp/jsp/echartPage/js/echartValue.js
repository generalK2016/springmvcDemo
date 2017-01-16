function initEchartsPic(){
    var url = "searchLine.html";
    $.ajax({
        type: 'POST',
        dataType:'json',
        url: url,
        success: function (datas) {
            createLine();
        },
        error: function (xhr, desc, err) {
        }
    })
}

function createLine(){
    // 使用
    require(
        [
            'echarts',
            'echarts/chart/bar', // 使用柱状图就加载bar模块，按需加载
            'echarts/chart/line'
        ],
        function (ec) {
            var myChart2 = ec.init(document.getElementById('main2'));
            myChart2.setOption({
                title : {
                    text: '被操作车辆次数排名',
                    x:'center',
                    y:'10',
                    textStyle:{
                        color:'#fff',
                        fontWeight:'normal'
                    }
                },
                tooltip : {
                    trigger: 'axis'
                },
                grid:{
                    x:40,
                    x2:10,
                    y:30,
                    y2:70,
                    borderWidth:0
                },
                color:['#eba538'],
                calculable : false,
                xAxis: [{
                    type: 'category',
                    boundaryGap: false,
                    data: ['车1','车2','车3','车4','车5','车6','车7','车8','车9','车10','车11','车12','车13','车14','车15','车16','车17'],
                    axisLabel: {
                        textStyle: {
                            color: '#fff'
                        },
                        rotate: 60,
                    },
                    splitLine: {
                        show: false
                    },
                }],
                yAxis: [{
                    type: 'value',
                    axisLabel: {
                        textStyle: {
                            color: '#fff'
                        }
                    },
                    splitLine: {
                        show: false
                    },
                }],
                series: [{
                    name: '被操作人员次数排名',
                    type: 'line',
                    smooth: false,
                    itemStyle: {
                        normal: {
                            label: {
                                show: true,
                                position: 'top',
                                textStyle: {
                                    color: '#fff9a0'
                                },
                            }
                        }
                    },
                    data: [4200, 1600, 4500, 2900, 6200, 3100, 6050, 4200, 5600, 1500, 5900, 4200, 2100, 6050, 200, 2600, 4500],
                }]
            });

        }
    );
}