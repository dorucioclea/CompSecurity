.class public final enum Lcom/facebook/contacts/server/x;
.super Ljava/lang/Enum;
.source "FriendGroupFqlHelper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/server/x;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/server/x;

.field public static final enum ALL:Lcom/facebook/contacts/server/x;

.field public static final enum FAVORITE_FRIENDS:Lcom/facebook/contacts/server/x;

.field public static final enum TOP_FRIENDS:Lcom/facebook/contacts/server/x;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 17
    new-instance v0, Lcom/facebook/contacts/server/x;

    const-string v1, "TOP_FRIENDS"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/server/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/x;->TOP_FRIENDS:Lcom/facebook/contacts/server/x;

    .line 18
    new-instance v0, Lcom/facebook/contacts/server/x;

    const-string v1, "FAVORITE_FRIENDS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/server/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/x;->FAVORITE_FRIENDS:Lcom/facebook/contacts/server/x;

    .line 19
    new-instance v0, Lcom/facebook/contacts/server/x;

    const-string v1, "ALL"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/server/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/x;->ALL:Lcom/facebook/contacts/server/x;

    .line 16
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/contacts/server/x;

    sget-object v1, Lcom/facebook/contacts/server/x;->TOP_FRIENDS:Lcom/facebook/contacts/server/x;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/server/x;->FAVORITE_FRIENDS:Lcom/facebook/contacts/server/x;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/server/x;->ALL:Lcom/facebook/contacts/server/x;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/contacts/server/x;->$VALUES:[Lcom/facebook/contacts/server/x;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/server/x;
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/facebook/contacts/server/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/x;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/server/x;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/facebook/contacts/server/x;->$VALUES:[Lcom/facebook/contacts/server/x;

    invoke-virtual {v0}, [Lcom/facebook/contacts/server/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/server/x;

    return-object v0
.end method
