.class Lcom/facebook/analytics/w;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/br;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 461
    iput-object p1, p0, Lcom/facebook/analytics/w;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 461
    invoke-direct {p0, p1}, Lcom/facebook/analytics/w;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/br;
    .locals 3

    .prologue
    .line 466
    new-instance v2, Lcom/facebook/analytics/br;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Lcom/facebook/analytics/i/a;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/i/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/analytics/br;-><init>(Lcom/facebook/analytics/av;Lcom/facebook/analytics/i/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 461
    invoke-virtual {p0}, Lcom/facebook/analytics/w;->a()Lcom/facebook/analytics/br;

    move-result-object v0

    return-object v0
.end method
