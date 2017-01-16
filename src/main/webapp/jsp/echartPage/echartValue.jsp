<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/jsp/echartPage/js/echartValue.js"></script>
    <!-- ECharts单文件引入 -->
    <script src="<%=request.getContextPath()%>/js/libs/echarts/echarts.js"></script>
    <script type="text/javascript">
        // 路径配置
        require.config({
            paths: {
                echarts: '<%=request.getContextPath()%>/js/libs/echarts'
            }
        });
        $(document).ready(function () {
            initEchartsPic();
        });
    </script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="height:400px"></div>
<div id="main2" style="height:400px"></div>
<%--<script type="text/javascript">
  // 路径配置
  require.config({
    paths: {
      echarts: '<%=request.getContextPath()%>/js/libs/echarts'
    }
  });

  // 使用
  require(
          [
            'echarts',
            'echarts/chart/bar', // 使用柱状图就加载bar模块，按需加载
            'echarts/chart/line'
          ],
          function (ec) {
            // 基于准备好的dom，初始化echarts图表
            var myChart = ec.init(document.getElementById('main'));

            var option = {
              tooltip: {
                show: true
              },
              legend: {
                data:['销量']
              },
              xAxis : [
                {
                  type : 'category',
                  data : ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
                }
              ],
              yAxis : [
                {
                  type : 'value'
                }
              ],
              series : [
                {
                  "name":"销量",
                  "type":"bar",
                  "data":[5, 20, 40, 10, 10, 20]
                }
              ]
            };

            // 为echarts对象加载数据
            myChart.setOption(option);



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
</script>--%>
</body>
</html>