.class Lcom/facebook/http/b/ad;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/c/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 458
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 458
    invoke-direct {p0}, Lcom/facebook/http/b/ad;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/c/a;
    .locals 2

    .prologue
    .line 462
    new-instance v1, Lcom/facebook/http/c/a;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    invoke-direct {v1, v0}, Lcom/facebook/http/c/a;-><init>(Lcom/facebook/prefs/shared/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 458
    invoke-virtual {p0}, Lcom/facebook/http/b/ad;->a()Lcom/facebook/http/c/a;

    move-result-object v0

    return-object v0
.end method
