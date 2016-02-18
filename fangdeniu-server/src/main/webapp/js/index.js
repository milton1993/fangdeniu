/**
 * Created by milton on 16-2-4.
 */
var currentPage = 1;
var pageSize = 4;
var maxPage;
$(document).ready(function() {
    getIndexFourArticlesByPageIndex(currentPage);
    $("#newer").click(function() {
        if (currentPage < maxPage) {
            currentPage ++;
            getIndexFourArticlesByPageIndex(currentPage);
        }
    });

    $("#older").click(function() {
        if (currentPage > 1) {
            currentPage --;
            getIndexFourArticlesByPageIndex(currentPage);
        }
    });
});

function getIndexFourArticlesByPageIndex(pageIndex) {
    if (parseInt(pageIndex) == pageIndex) {
        $.ajax({
            type: 'POST',
            url: '/server/article/indexFour',
            dataType: 'json',
            contentType: 'application/json',
            data: '{"pageIndex":' + pageIndex + ', "pageSize":' + pageSize + '}',
            success: function (data) {
                if (data.status == 0) {
                    emptyAllArticles();
                    maxPage = data.data.pageSize;
                    var length = data.data.articles.length;
                    if (length >= 1) {
                        var article1 = data.data.articles[0];
                        addOneArticle(1, article1)
                        if (length >= 2) {
                            var article2 = data.data.articles[1];
                            addOneArticle(2, article2);
                            if (length >= 3) {
                                var article3 = data.data.articles[2];
                                addOneArticle(3, article3);
                                if (length >= 4) {
                                    var article4 = data.data.articles[3];
                                    addOneArticle(4, article4);
                                }
                            }
                        }
                    }
                }
            },
            error: function (data) {
            }
        });
    }
}

function emptyAllArticles() {
    $("#article1").empty();
    $("#article2").empty();
    $("#article3").empty();
    $("#article4").empty();
}

function addOneArticle(index, articleObj) {
    index = parseInt(index);
    if (index <= pageSize) {
        $("#article" + index).append('<header><img src="' + articleObj.imagePath + '"><h3><a href="blog-detail.html">' + articleObj.title + '</a></h3> <span class="meta">'+ new Date(articleObj.updateTime).format('yyyy-MM-dd') +', Milton</span> <hr> </header> <div class="body">' + articleObj.abstractContent + '</div> <div class="clearfix"> <a href="blog-detail.html?id=' + articleObj.id + '" class="btn btn-tales-one">阅读全部</a> </div>');
    }
}