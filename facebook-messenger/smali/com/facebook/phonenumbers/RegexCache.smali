.class public Lcom/facebook/phonenumbers/RegexCache;
.super Ljava/lang/Object;


# instance fields
.field private cache:Lcom/facebook/phonenumbers/RegexCache$LRUCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/phonenumbers/RegexCache$LRUCache",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/facebook/phonenumbers/RegexCache$LRUCache;

    invoke-direct {v0, p1}, Lcom/facebook/phonenumbers/RegexCache$LRUCache;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/phonenumbers/RegexCache;->cache:Lcom/facebook/phonenumbers/RegexCache$LRUCache;

    return-void
.end method


# virtual methods
.method public getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 2

    iget-object v0, p0, Lcom/facebook/phonenumbers/RegexCache;->cache:Lcom/facebook/phonenumbers/RegexCache$LRUCache;

    invoke-virtual {v0, p1}, Lcom/facebook/phonenumbers/RegexCache$LRUCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/regex/Pattern;

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/phonenumbers/RegexCache;->cache:Lcom/facebook/phonenumbers/RegexCache$LRUCache;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/phonenumbers/RegexCache$LRUCache;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method
