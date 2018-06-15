
// Charts.js
// ====================================================================
// This file should not be included in your project.
// This is just a sample how to initialize plugins or components.
//
// - ThemeOn.net -



$(document).ready(function() {

    // EASY PIE CHART
    // =================================================================
    // Require easyPieChart
    // -----------------------------------------------------------------
    // http://rendro.github.io/easy-pie-chart/
    // =================================================================
    $('#demo-pie-1').easyPieChart({
        barColor :'#68b828',
        scaleColor: false,
        trackColor : '#eee',
        lineCap : 'round',
        lineWidth :8,
        onStep: function(from, to, percent) {
            $(this.el).find('.pie-value').text(Math.round(percent) + '%');
        }
    });
    $('#demo-pie-2').easyPieChart({
        barColor :'#8465d4',
        scaleColor:false,
        trackColor : '#eee',
        lineCap : 'butt',
        lineWidth :8,
        onStep: function(from, to, percent) {
            $(this.el).find('.pie-value').text(Math.round(percent) + '%');
        }
    });




    // SPARKLINE AREA CHART
    // =================================================================
    // Require sparkline
    // -----------------------------------------------------------------
    // http://omnipotent.net/jquery.sparkline/#s-about
    // =================================================================
    var hddSparkline = function() {
        $("#demo-sparkline-area").sparkline([27,39,40,62,73,119,76,177,83,112,157,150,130,165,170,268], {
            type: 'line',
            width: '100%',
            height: '80',
            spotRadius: 5,
            lineWidth: 1,
            lineColor:'rgba(255,255,255,.85)',
            fillColor: 'rgba(0,0,0,0.03)',
            spotColor: 'rgba(255,255,255,.5)',
            minSpotColor: 'rgba(255,255,255,.5)',
            maxSpotColor: 'rgba(255,255,255,.5)',
            highlightLineColor : '#ffffff',
            highlightSpotColor: '#ffffff',
            tooltipChartTitle: 'Usage',
            tooltipSuffix:' %'

        });
    }



    // SPARKLINE LINE CHART
    // =================================================================
    // Require sparkline
    // -----------------------------------------------------------------
    // http://omnipotent.net/jquery.sparkline/#s-about
    // =================================================================
    var earningSparkline = function(){
        $("#demo-sparkline-line").sparkline([145,304,205,355,378,567,586,685,458,742,865], {
            type: 'line',
            width: '100%',
            height: '80',
            spotRadius: 4,
            lineWidth:1,
            lineColor:'#ffffff',
            fillColor: false,
            minSpotColor :false,
            maxSpotColor : false,
            highlightLineColor : '#ffffff',
            highlightSpotColor: '#ffffff',
            tooltipChartTitle: 'Earning',
            tooltipPrefix :'$ ',
            spotColor:'#ffffff',
            valueSpots : {
                '0:': '#ffffff'
            }
        });
    }

    var earningSparkline2 = function(){
        $("#demo-sparkline-line2").sparkline([345,404,305,455,378,567,586,685,458,742,565], {
            type: 'line',
            width: '100%',
            height: '80',
            spotRadius: 4,
            lineWidth:1,
            lineColor:'#ffffff',
            fillColor: false,
            minSpotColor :false,
            maxSpotColor : false,
            highlightLineColor : '#ffffff',
            highlightSpotColor: '#ffffff',
            tooltipChartTitle: 'Earning',
            tooltipPrefix :'$ ',
            spotColor:'#ffffff',
            valueSpots : {
                '0:': '#ffffff'
            }
        });
    }


    // SPARKLINE BAR CHART
    // =================================================================
    // Require sparkline
    // -----------------------------------------------------------------
    // http://omnipotent.net/jquery.sparkline/#s-about
    // =================================================================
    var barEl = $("#demo-sparkline-bar");
    var barValues = [40,32,65,53,62,55,24,67,45,70,45,56,34,67,76,32,65,53,62,55,24,67,45,70,45,56,70,45,56,34,67,76,32,65,53,62,55];
    var barValueCount = barValues.length;
    var barSpacing = 1;
    var salesSparkline = function(){
         barEl.sparkline(barValues, {
            type: 'bar',
            height: 80,
            barWidth: Math.round((barEl.parent().width() - ( barValueCount - 1 ) * barSpacing ) / barValueCount),
            barSpacing: barSpacing,
            zeroAxis: false,
            tooltipChartTitle: 'Daily Sales',
            tooltipSuffix: ' Sales',
            barColor: 'rgba(255,255,255,.7)'
        });
    }


    // SPARKLINE PIE CHART
    // =================================================================
    // Require sparkline
    // -----------------------------------------------------------------
    // http://omnipotent.net/jquery.sparkline/#s-about
    // =================================================================
    $("#demo-sparkline-pie").sparkline([5, 12, 17 ,55], {
        type: 'pie',
        width: '55',
        height: '55',
        tooltipChartTitle: 'Top Movies',
        tooltipFormat: '{{offset:offset}} ({{percent.1}}%)',
        tooltipValueLookups: {
            'offset': {
                0: 'Drama',
                1: 'Action',
                2: 'Comedy',
                3: 'Adventure'
            }
        },
        sliceColors: ['#2d4859','#fe7211','#7ad689','#128376'],
    });


    // SPARKLINE AUTO RESIZE
    // =================================================================
    $('window').on('resizeEnd', function(){
        hddSparkline();
        earningSparkline();
        earningSparkline2();
        salesSparkline();
    })
    hddSparkline();
    earningSparkline();
    earningSparkline2();
    salesSparkline();
    // =================================================================





    // MORRIS AREA CHART
    // =================================================================
    // Require MorrisJS Chart
    // -----------------------------------------------------------------
    // http://morrisjs.github.io/morris.js/
    // =================================================================

    Morris.Area({
        element: 'demo-morris-area-1',
        data: [{
            period: 'January',
            dl: 77,
            up: 25
            }, {
            period: 'February',
            dl: 127,
            up: 58
            }, {
            period: 'March',
            dl: 115,
            up: 46
            }, {
            period: 'April',
            dl: 209,
            up: 37
            }, {
            period: 'May',
            dl: 146,
            up: 75
            }, {
            period: 'June',
            dl: 197,
            up: 57
            }, {
            period: 'July',
            dl: 105,
            up: 70
            }, {
            period: 'August',
            dl: 215,
            up: 106
            }, {
            period: 'September',
            dl: 239,
            up: 187
            }, {
            period: 'October',
            dl: 266,
            up: 215
            }],
        gridEnabled: false,
        gridLineColor: 'transparent',
        behaveLikeLine: true,
        xkey: 'period',
        ykeys: ['dl', 'up'],
        labels: ['Visitor', 'Pageview'],
        lineColors: ['#045d97'],
        pointSize: 0,
        pointStrokeColors : ['#045d97'],
        lineWidth: 0,
        resize:true,
        hideHover: 'auto',
        fillOpacity: 0.7,
        parseTime:false
    });

    Morris.Area({
        element: 'demo-morris-area-2',
        data: [{
            period: 'January',
            dl: 77,
            up: 25
            }, {
            period: 'February',
            dl: 127,
            up: 58
            }, {
            period: 'March',
            dl: 115,
            up: 46
            }, {
            period: 'April',
            dl: 239,
            up: 57
            }, {
            period: 'May',
            dl: 46,
            up: 75
            }, {
            period: 'June',
            dl: 97,
            up: 57
            }, {
            period: 'July',
            dl: 105,
            up: 70
            }, {
            period: 'August',
            dl: 115,
            up: 106
            }, {
            period: 'September',
            dl: 239,
            up: 187
            }, {
            period: 'October',
            dl: 246,
            up: 215
            }],
        gridEnabled: false,
        gridLineColor: 'transparent',
        behaveLikeLine: true,
        xkey: 'period',
        ykeys: ['dl', 'up'],
        labels: ['Visitor', 'Pageview'],
        lineColors: ['#FF00FF'],
        pointSize: 0,
        pointStrokeColors : ['#FF00FF'],
        lineWidth: 0,
        resize:true,
        hideHover: 'auto',
        fillOpacity: 0.7,
        parseTime:false
    });

    // Flot tooltip
    // =================================================================
    $("<div id='demo-flot-tooltip'></div>").css({
        position: "absolute",
        display: "none",
        padding: "10px",
        color: "#fff",
        "text-align":"right",
        "background-color": "#1c1e21"
    }).appendTo("body");


    $("#demo-flot-line").bind("plothover", function (event, pos, item) {

        if (item) {
            var x = item.datapoint[0].toFixed(2),  y = item.datapoint[1];
            $("#demo-flot-tooltip").html("<p class='h4'>" + item.series.label + "</p>" + y)
                .css({top: item.pageY+5, left: item.pageX+5})
                .fadeIn(200);
        } else {
            $("#demo-flot-tooltip").hide();
        }

    });

});
